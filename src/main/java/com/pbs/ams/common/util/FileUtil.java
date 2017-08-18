package com.pbs.ams.common.util;

import java.io.File;

/**
 * Created by TiAmo on 17/6/17.
 */
public class FileUtil {

    // 递归删除非空文件夹
    public static void deleteDir(File dir) {
        if (dir.isDirectory()) {
            File[] files = dir.listFiles();
            assert files != null;
            for (File file : files) {
                deleteDir(file);
            }
        }
        dir.delete();
    }
}
