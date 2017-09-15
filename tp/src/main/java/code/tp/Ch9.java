package code.tp;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ch9 {
	
	void walk() throws IOException {
		Path p1 = Paths.get("c:\\a\\b") ;
		Path p2 = FileSystems.getDefault().getPath("");
		Path re = Files.walk(p1, Integer.MAX_VALUE).filter(p->p.endsWith(".java")).findAny().orElse(null) ;
	}

}
