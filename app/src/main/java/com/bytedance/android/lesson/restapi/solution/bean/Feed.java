package com.bytedance.android.lesson.restapi.solution.bean;

/**
 * @author Xavier.S
 * @date 2019.01.20 14:18
 */
public class Feed {

    // TODO-C2 (1) Implement your Feed Bean here according to the response json
    String student_id;
    String user_name;
    String image_url;
    String _id;
    String video_url;
    String createdAt;
    String updatedAt;

    public String getImage_url(){
        return image_url;
    }
}
