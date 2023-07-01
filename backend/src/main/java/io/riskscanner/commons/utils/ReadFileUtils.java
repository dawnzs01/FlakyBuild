package io.riskscanner.commons.utils;

import org.springframework.core.io.ClassPathResource;

import java.io.*;
import java.util.Scanner;

/**
 * @ClassName ReadFileUtils
 * @Description 读取文件内容
 * @Author maguohao
 * @Date 2020/10/1
 * @Version 1.0
 **/
public class ReadFileUtils {

    /**
     * 读取json文件
     * @param fileFolder
     * @param fileName
     * @return
     * @throws FileNotFoundException
     */
    public static String readJsonFile(String fileFolder, String fileName) throws FileNotFoundException {
        File file = new File(fileFolder + fileName);
        boolean loadDefault = true;
        String jsonString = null;
        if (file.exists()) {
            Scanner scanner = null;
            StringBuilder buffer = new StringBuilder();
            try {
                scanner = new Scanner(file, "utf-8");
                while (scanner.hasNextLine()) {
                    buffer.append(scanner.nextLine());
                }
                jsonString = buffer.toString();
                loadDefault = false;
            } catch (Exception e) {
                LogUtil.error(e.getMessage());
            } finally {
                if (scanner != null) {
                    scanner.close();
                }
            }
        }
        if (loadDefault) {
            InputStream inputStream = new FileInputStream(fileName);
            jsonString = getContentFromStream(inputStream);
        }
        return jsonString;
    }

    private static String getContentFromStream(InputStream inputStream) {
        Reader reader = new InputStreamReader(inputStream);
        BufferedReader br = new BufferedReader(reader);
        StringBuilder sb = new StringBuilder();
        try {
            String line = br.readLine();
            while (line != null) {
                sb.append(line).append("\n");
                line = br.readLine();
            }
        } catch (IOException e) {
            LogUtil.error("Error reading file contents!" + e.getMessage());
        } finally {
            try {
                reader.close();
                br.close();
            } catch (IOException e) {
            }
        }
        return sb.toString();
    }

    /**
     * 读取文件
     * @param filePath
     * @return
     * @throws FileNotFoundException
     */
    public static String readToBuffer(String filePath) throws IOException,FileNotFoundException {
        StringBuffer sb = new StringBuffer();
        try {
            InputStream is = new FileInputStream(filePath);
            String line; // 用来保存每行读取的内容
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            line = reader.readLine(); // 读取第一行
            while (line != null) { // 如果 line 为空说明读完了
                sb.append(line); // 将读到的内容添加到 buffer 中
                sb.append("\n"); // 添加换行符
                line = reader.readLine(); // 读取下一行
            }
            reader.close();
            is.close();
        } catch (FileNotFoundException e) {
            LogUtil.error("File not found!" + e.getMessage());
            throw new FileNotFoundException("File not found:" + filePath);
        } catch (IOException e) {
            LogUtil.error(e.getMessage());
            throw new FileNotFoundException(e.getMessage());
        }
        return sb.toString();
    }

    /**
     * 读取文件
     * @param baseDic: support/credential/
     * @param fileName: fit2cloud-huawei-plugin
     * @param extension: .json
     * @return
     * @throws Exception
     */
    public static String readConfigFile(String baseDic, String fileName, String extension) throws Exception {
        InputStream is = null;
        BufferedReader br = null;
        try {
            ClassPathResource resource = new ClassPathResource(baseDic + fileName + extension);
            is = resource.getInputStream();
            br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
            StringBuffer sb = new StringBuffer();
            String line = null;
            while ((line = br.readLine()) != null) {
                sb.append(line.trim());
            }
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                }
                is = null;
            }
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                }
                br = null;
            }
        }
    }


}
