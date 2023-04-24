package Services;

import Model.Post;
import Repo.PostRepo;

public class PostService {

        PostRepo postRepo;

        public PostService(){
            postRepo=new PostRepo();
        }

        public void Post(Post post){

            postRepo.addPost(post);
        }
}
