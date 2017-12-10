package xspeedit.test;


import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.voyagesncf.xspeedit.service.impl.RobotActuel;
import com.voyagesncf.xspeedit.utils.UtilsXspeedit;

/**
 * 
 * @author ABG
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class RobotActuelleTest {

	 String chaineArticle = "163841689525773";
	 String chaineArticleEmballerRobotActuel = "163/8/41/6/8/9/52/5/7/73";

	 
	 @Mock
	 UtilsXspeedit gUtilsXspeedit;
	 
	 @InjectMocks
     RobotActuel gInjectRobotActuel;
   
    
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	
	@Before
	public void setUp() throws Exception {
	}

	
	@Test
	public void testRobotActuel() {
		when(gUtilsXspeedit.conertirChainEnIntegerArray(chaineArticle)).thenReturn(new int[] {1,6,3,8,4,1,6,8,9,5,2,5,7,7,3});
		gInjectRobotActuel.emballeCarton(chaineArticle);
		verify( gUtilsXspeedit, times(1) ).conertirChainEnIntegerArray(chaineArticle);
		
		assertEquals(chaineArticleEmballerRobotActuel, gInjectRobotActuel.emballeCarton(chaineArticle));
				
	}
	
	


	
	
	
	
	
	
	
	
}
