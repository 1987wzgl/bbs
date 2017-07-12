package cn.iver.test;


import cn.iver.common.Const;
import cn.iver.ext.beetl.BeetlRender;
import cn.iver.ext.beetl.IsSameFunction;
import cn.iver.ext.beetl.PrintTimeFunction;
import com.jfinal.kit.PathKit;
import com.jfinal.render.IMainRenderFactory;
import com.jfinal.render.Render;
import org.bee.tl.core.GroupTemplate;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        //String osName = System.getProperty("os.name");
        //System.out.println(osName);
//        System.out.println(osName.indexOf("7"));
        //System.out.println("1,2,".substring(0, 3));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(new Date()));
//        System.out.println(new Date());




    }
}

