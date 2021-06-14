package com.salmon.design.pattern.creational.simplefactory;

/**
 * @date 2021-6-14 - 17:44
 * Created by Salmon
 */
public class Test {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        //此时如果需要把java、改成python则需要new PythonVideo,这样就依赖于实现类了
//        Video video = new JavaVideo();
//        video.produce();
//



//        VideoFactory videoFactory = new VideoFactory();
//        Video video = videoFactory.getVideo("java");
//        if(video == null){
//            return;
//        }
//        video.produce();
//    }


        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo(JavaVideo.class);
        if(video == null){
            return;
        }
        video.produce();
    }
}
