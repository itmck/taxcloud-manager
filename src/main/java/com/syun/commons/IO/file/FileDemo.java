package com.syun.commons.IO.file;

import org.junit.Test;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

/**
 * Create by it_mck 2018/9/5 16:52
 *
 * @Description:
 * @Version: 1.0
 */
public class FileDemo {


    /**
     * 获取路径对象
     */
    @Test
    public void run() {

        // File(String pathname)：根据一个路径得到File对象
        // 把e:\\demo\\a.txt封装成一个File对象
        File file = new File("E:\\demo\\a.txt");

        // File(String parent, String child):根据一个目录和一个子文件/目录得到File对象
        File file2 = new File("E:\\demo", "a.txt");

        // File(File parent, String child):根据一个父File对象和一个子文件/目录得到File对象
        File file3 = new File("e:\\demo");
        File file4 = new File(file3, "a.txt");

        // 以上三种方式其实效果一样
    }


    /**
     * public boolean createNewFile():创建文件 如果存在这样的文件，就不创建了
     * 首先创建时必须保证父文件夹已经存在,否则异常
     */
    public void run1() throws IOException {

        File file = new File("e:\\file\\s.txt");
        if (!file.exists()) {
            //不存在就创建
            file.createNewFile();//java.io.IOException:说明父文件夹不存在,无法创建.否则抛出异常
        }
    }

    /**
     * public boolean mkdir():创建文件夹 如果存在这样的文件夹，就不创建了
     * <p>
     * 父文件夹不存在,不会创建
     */
    @Test
    public void run2() {

        //封装路径对象
        File file = new File("e:\\file\\aa");
        if (!file.exists()) {
            file.mkdir();
        }
    }

    /**
     * public boolean mkdirs():创建文件夹 如果存在这样的文件夹，就不创建了
     * <p>
     * 其实就是递归创建
     * 父文件夹不存在,不会创建
     */
    @Test
    public void run3() {

        //封装路径对象
        File file = new File("e:\\file\\aa");
        if (!file.exists()) {
            file.mkdirs();
        }
    }

    /**
     * public boolean delete():删除功能
     */

    @Test
    public void run4() {

        //先创建几个文件夹
        //1封装路径对象
        File file = new File("e:\\file\\aa");
        if (!file.exists()) {
            file.mkdirs();
        }
        //删除:删除不能递归删除,只能删除空的文件夹
        //先删除子文件夹
        File file1 = new File("e:\\file\\aa");
        file1.delete();

        //再次删除父文件夹
        File file2 = new File("e:\\file");
        file2.delete();
    }

    /**
     * 重命名功能:public boolean renameTo(File dest)
     * 路径名相同:直接改名
     * 路径名不同:改名并剪切
     */
    @Test
    public void run5() {

        //封装源对象
        File file = new File("e:\\file\\123.txt");
        //目标对象
        File file1 = new File("e:\\file\\456.txt");

        System.out.println("修改:" + file.renameTo(file1));

    }

    /*
     * 判断功能:
     * public boolean isDirectory():判断是否是目录
     * public boolean isFile():判断是否是文件
     * public boolean exists():判断是否存在
     * public boolean canRead():判断是否可读
     * public boolean canWrite():判断是否可写
     * public boolean isHidden():判断是否隐藏
     */
    @Test
    public void run6() {

        //封装源对象
        File file = new File("e:\\file\\123.txt");
        System.out.println(file.exists());//true
        System.out.println(file.canRead());//true
        System.out.println(file.isFile());//true
        System.out.println(file.isDirectory());//false
        System.out.println(file.isHidden());//false
    }
    /*
     * 获取功能：
     * public String getAbsolutePath()：获取绝对路径
     * public String getPath():获取相对路径
     * public String getName():获取名称
     * public long length():获取长度。字节数
     * public long lastModified():获取最后一次的修改时间，毫秒值
     */

    @Test
    public void run7() {


        //封装源对象
        File file = new File("e:\\file\\123.txt");
        System.out.println("绝对路径:" + file.getAbsolutePath());
        System.out.println("相对路径:" + file.getPath());
        System.out.println("文件名:" + file.getName());
        System.out.println("文件长度" + file.length());
        System.out.println("最后修改时间" + file.lastModified());
    }

    /*
     * 获取功能：
     * public String[] list():获取指定目录下的所有文件或者文件夹的名称数组
     * public File[] listFiles():获取指定目录下的所有文件或者文件夹的File数组
     */
    @Test
    public void run8() {

        //封装源对象
        File file = new File("e:\\file");
        String[] list = file.list();//获取指定目录下的所有文件或者文件夹的名称数组
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("=========================");
        File[] files = file.listFiles();//获取指定目录下的所有文件或者文件夹的File数组
        for (File s : files) {
            //判断是否是文件并且是否以.txt结尾
            if (s.isFile() && s.getName().endsWith(".txt")) {
                //是就输出
                System.out.println(s.getName());
            }
        }

    }
    /**
     *
     *  public String[] list(FilenameFilter filter)
     *  public File[] listFiles(FilenameFilter filter)
     *
     */

    @Test
    public void run9(){

        File file = new File("e:\\file");
        String[] strArray = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                // return false;
                // return true;
                // 通过这个测试，我们就知道了，到底把这个文件或者文件夹的名称加不加到数组中，取决于这里的返回值是true还是false
                // 所以，这个的true或者false应该是我们通过某种判断得到的
                // System.out.println(dir + "---" + name);
                // File file = new File(dir, name);
                // // System.out.println(file);
                // boolean flag = file.isFile();
                // boolean flag2 = name.endsWith(".jpg");
                // return flag && flag2;
                return new File(dir, name).isFile() && name.endsWith(".txt");
            }
        });

        // 遍历
        for (String s : strArray) {
            System.out.println(s);
        }
        System.out.println("====================");
        File[] files = file.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {

                //dir表示文件的当前目录，name表示文件名；
                return new File(dir, name).isFile() && name.endsWith(".txt");
            }
        });

        for (File f:files) {
            System.out.println(f);
        }

    }

}
