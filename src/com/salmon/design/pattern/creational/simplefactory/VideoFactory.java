package com.salmon.design.pattern.creational.simplefactory;

/**
 * @date 2021-6-14 - 17:46
 * Created by Salmon
 */
public class VideoFactory {

    //v1 方法实现
//    public Video getVideo(String type){
//        //equalsIgnoreCase：忽略大小写的字符串比较
//        if("java".equalsIgnoreCase(type)){
//            return new JavaVideo();
//        }else if("python".equalsIgnoreCase(type)){
//            return new PythonVideo();
//        }
//        return null;
//    }

    //v2 反射实现
    public Video getVideo(Class C) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Video video = (Video) Class.forName(C.getName()).newInstance();
        return video;
    }

}
