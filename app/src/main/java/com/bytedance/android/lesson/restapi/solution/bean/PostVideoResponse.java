package com.bytedance.android.lesson.restapi.solution.bean;

import org.json.JSONObject;

/**
 * @author Xavier.S
 * @date 2019.01.18 17:53
 */
public class PostVideoResponse {

    // TODO-C2 (3) Implement your PostVideoResponse Bean here according to the response json
    JSONObject result;
    String url;
    boolean success;
    private Feed feed;
    public boolean isResult() {
        return success;
    }

    public Feed getFeed() {
        return feed;
    }
}
