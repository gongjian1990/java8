package com.others;

import java.io.*;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/**
 * 练习解压
 */
public class TestZipFile {

    /**
     *
     */
    public static void unPressFile(String zipFilePath,String unZipFilePth){

        BufferedOutputStream bos = null;
        BufferedInputStream bis = null;

        try {
            File zipFile = new File(zipFilePath);
            String fileName = zipFile.getName();
            if(fileName!=null){
                fileName = fileName.substring(0, fileName.indexOf("."));
            }
            unZipFilePth = unZipFilePth+File.separator+fileName;
            //创建解压路径
            File upZipFileDir = new File(unZipFilePth);
            if(!upZipFileDir.exists()){
                upZipFileDir.mkdirs();
            }
            // 开始解压
            ZipEntry entry = null;
            String entryFilePath = null;
            Integer index = null;
            String entryDirPath = null;
            File entryDir = null;
            File entryFile = null;

            ZipFile zip = new ZipFile(zipFile);
            Enumeration<? extends ZipEntry> entries = zip.entries();
            while (entries.hasMoreElements()){
                entry = entries.nextElement();
                entryFilePath = unZipFilePth+File.separator+entry.getName();
                index = entryFilePath.lastIndexOf(File.separator);
                if(index!= -1){
                    entryDirPath = entryFilePath.substring(0, index);
                }else {
                    entryFilePath="";
                }
                entryDir = new File(entryFilePath);
                if(entryDir.exists()){
                    entryDir.delete();
                }
                if(!entryDir.isDirectory()||!entryDir.exists()){
                    entryDir.mkdirs();
                }
                //创建解压文件
                entryFile = new File(entryFilePath);
                if(entryFile.exists()){
                    entryFile.delete();
                }

                bos = new BufferedOutputStream(new FileOutputStream(entryFile));
                bis = new BufferedInputStream(zip.getInputStream(entry));
                int len;
                int bufferSize = 1024;
                byte[] buff = new byte[1024];
                while ((len=bis.read(buff,0,bufferSize))!=-1){
                    bos.write(buff,0,len);
                }
                bos.flush();
                bos.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        unPressFile("e:/a.zip","e:/a/");
    }
}
