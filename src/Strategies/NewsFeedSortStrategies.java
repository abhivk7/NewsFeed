package Strategies;

import Model.Post;
import Model.User;

import java.util.List;

public interface NewsFeedSortStrategies {

    public List<Post> sortNewsFeed(List<Post> listOfPost, User user);
}
