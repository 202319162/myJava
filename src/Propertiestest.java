import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Propertiestest {
    public static void main(String[] args) throws IOException {
//        properties作为map集合的基本使用
        String porpath = "E:\\code\\puzzlegame\\a.properties";
        File file = new File(porpath);
        if(!file.exists()){
            file.createNewFile();
        }
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        Properties prop = new Properties();
        prop.put("aaa", "111");
        prop.put("bbb", "222");
        prop.put("ccc", "333");
        prop.put("ddd", "444");
        Set<Map.Entry<Object, Object>> entries = prop.entrySet();
        for(Map.Entry<Object, Object> entry : entries){
            System.out.println(entry.getKey() + "=" + entry.getValue());
            bw.write(entry.getKey() + "=" + entry.getValue());
            bw.newLine();
        }
        bw.close();
        Set<Object> keys = prop.keySet();
        for(Object key : keys){
            Object value = prop.get(key);
            prop.put(key, value);
        }
//        properties用store将配置存储到本地

//        properties用load将配置加载到文件

    }
}
