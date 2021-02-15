package week15.week15d03;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PostFinder {

    private List<Post> posts = new ArrayList<>();

    public PostFinder(List<Post> posts) {
        this.posts = posts;
    }

    public List<Post> findPostsFor(String user){
        List<Post> result = new ArrayList<>();
        for(Post post : posts){
            Objects.requireNonNull(post.getTitle());
            Objects.requireNonNull(post.getContent());
            if(user.equals(post.getOwner()) && LocalDate.now().isAfter(post.getPublishedAt())){
                result.add(post);
            }
        }
        return result;
    }

}
