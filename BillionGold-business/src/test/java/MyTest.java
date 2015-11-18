import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.billiongold.business.dao.reference.ProductDao;
import com.billiongold.business.dao.user.GroupDao;
import com.billiongold.business.dao.user.RelationUserGroupDao;
import com.billiongold.business.dao.user.UserDao;
import com.billiongold.business.service.user.UserService;
import com.billiongold.domain.reference.Product;
import com.billiongold.domain.user.Group;
import com.billiongold.domain.user.RelationUserGroup;
import com.billiongold.domain.user.User;
import com.ginrye.baseframework.java.base.ComponentContext;
import com.ginrye.baseframework.java.test.BaseH2DBTest;

@ContextConfiguration("classpath:applicationContext.xml")
public class MyTest extends BaseH2DBTest {
	
	@Autowired
	private ProductDao productDao;
	
	@Autowired
	private GroupDao groupDao;
	
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private RelationUserGroupDao relationUserGroupDao;

	@Override
	protected String[] getDataSets() {
		return new String[] {
			"reference/bg_ref_product.xml",
			"user/bg_usr_group.xml",
			"user/bg_usr_user.xml",
			"user/bg_usr_rel_user_group.xml"
		};
	}

	@Test
	public void testProduct() {
		Product p = productDao.findById(1);
		org.junit.Assert.assertTrue(p != null);
	}

	@Test
	public void testUser() {
		User u = userDao.findById(1);
		org.junit.Assert.assertTrue(u != null);
	}
	
	@Test
	public void testGroup() {
		Group g = groupDao.findById(1);
		org.junit.Assert.assertTrue(g != null);
	}
	
	@Test
	public void testRelationUserGroup() {
		RelationUserGroup r = relationUserGroupDao.findById(1);
		org.junit.Assert.assertTrue(r != null);
	}
	
	public void test() {
		UserService userService = ComponentContext.getInstance(UserService.class);
		System.out.println(userService);
	}
}
