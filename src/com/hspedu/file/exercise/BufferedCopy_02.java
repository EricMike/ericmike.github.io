package com.hspedu.file.exercise;

import java.io.*;

public class BufferedCopy_02 {
    public static void main(String[] args) {
        String srcFilePath = "C:\\Users\\Eric小麦\\Desktop\\腾格尔.mp4";
        String destFilePath = "C:\\Users\\Eric小麦\\Desktop\\koala.mp4";

        //创建BufferedOutputStream对象BufferedInputStream对象
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try {
            //因为FileInputStream 是InputStream的子类
            bis = new BufferedInputStream(new FileInputStream(srcFilePath));
            bos = new BufferedOutputStream(new FileOutputStream(destFilePath));

            //循环的读取文件，并写入到 destFilePath
            byte[] buf = new byte[1024];
            int readLen = 0;
            //当返回-1时，就表示文件读取完毕
            while ((readLen = bis.read(buf))!=-1){
                bos.write(buf,0,readLen);
            }
            System.out.println("文件拷贝完毕~");

        } catch (IOException e) {
            e.printStackTrace();
        }finally {

            //关闭流,外层处理流即可，底层会去关闭节点流
            try {
                if (bis!=null){
                    bis.close();
                }
                if (bos!=null){
                    bos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
