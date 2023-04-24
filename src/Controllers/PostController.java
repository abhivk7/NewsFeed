package Controllers;

import Model.Post;
import Services.PostService;

public class PostController {

    PostService postService;

    public PostController(){
        postService=new PostService();
    }

    public void post(Post post){

        postService.Post(post);
    }
}
