package usa.edu.mum.asd.lectures.lec9.strategy;

import java.io.File;
import java.util.List;

public interface CompressionStrategy {

    public Archive compressFiles(List<File> files);
}
