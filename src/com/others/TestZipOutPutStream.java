package com.others;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * 练习ZipOutPutStream,
 *
 */
public class TestZipOutPutStream {


    /**
     * 实现压缩文件功能
     * @param srcfiles  源文件
     * @param destfile  压缩后文件
     */
    public static void zipFile(List<File> srcfiles,File destfile) throws Exception {

        FileInputStream fis = null;
        ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(destfile));
        try {
            for (int i = 0; i < srcfiles.size(); i++) {
                File file = srcfiles.get(i);
                fis = new FileInputStream(file);
                zipOutputStream.putNextEntry(new ZipEntry(file.getName()));
                int len ;
                byte[] buff = new byte[1024];
                while ((len=fis.read(buff))>0){
                    zipOutputStream.write(buff,0,len);
                }
                zipOutputStream.closeEntry();
            }
            System.out.println("压缩完成！");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fis!=null){
                fis.close();
            }
            if(zipOutputStream!=null){
                zipOutputStream.close();
            }
        }
    }

    public static void main(String[] args) throws Exception {
        File file = new File("e:/a.txt");
        Arrays.asList(file);
        File dest = new File("e:/a.zip");

        zipFile( Arrays.asList(file),dest);
    }
}
