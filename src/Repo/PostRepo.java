package Repo;

import Model.Post;

import java.util.ArrayList;
import java.util.List;

public class PostRepo {

    List<Post> listofpost;

    public PostRepo(){
        listofpost=new ArrayList<>();
    }

    public Post getPostById(int id){

        for(Post post:listofpost){
            if(post.getPostId()==id) return post;
        }
        return null;
    }

    public void addPost(Post post){
        listofpost.add(post);
    }
}
