package menu.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import menu.beans.MenuItem;

@Repository
public interface MenuItemRepository extends JpaRepository<MenuItem, Long>{

}
