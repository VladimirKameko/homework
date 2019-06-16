package IO;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.TreeMap;

public class ReaderWriter {
    Map<Character, Integer> list = new TreeMap<>();
    public Map<Character, Integer> readAndWrite(File inFile, File outFile) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(inFile)))) {
            String text;
            while ((text = reader.readLine()) != null) {
                for (char ch : text.replaceAll("\\s+", "").toLowerCase().toCharArray()) {
                    if (list.get(ch) == null) {
                        list.put(ch, 1);
                    } else {
                        list.put(ch, list.get(ch) + 1);
                    }
                }
                text.toCharArray();
            }
        }
        try (BufferedWriter write = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outFile)))) {
            for (Map.Entry<Character, Integer> out : list.entrySet()) {
                write.write(out.getKey() + "-" + out.getValue() + "\n");
            }
        }
        return list;
    }
}
