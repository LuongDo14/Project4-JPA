package ra.repositoryImp;

import org.springframework.stereotype.Repository;
import ra.model.Categories;
import ra.repository.CategoriesRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class CategoriesRepositoryImp implements CategoriesRepository {
    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public List<Categories> findAll() {
        return entityManager.createQuery("select c from Categories as c", Categories.class).getResultList();
    }

    @Override
    public Categories findById(int catalogId) {
        return null;
    }
}