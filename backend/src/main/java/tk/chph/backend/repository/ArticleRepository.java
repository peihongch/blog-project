package tk.chph.backend.repository;

import org.apache.ibatis.annotations.Mapper;
import tk.chph.backend.pojo.Archive;
import tk.chph.backend.pojo.Article;
import tk.chph.backend.pojo.SearchResult;
import tk.chph.backend.pojo.TagArchive;

import java.util.List;

@Mapper
public interface ArticleRepository {
    List<Article> getArticles();

    List<Archive> getDateAndTitle();

    List<SearchResult> findArticles(String key);

    List<TagArchive> getArticleNames(List<Integer> articleIds);
}
