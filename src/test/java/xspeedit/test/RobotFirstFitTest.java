package xspeedit.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.voyagesncf.xspeedit.service.impl.RobotFitFirst;
import com.voyagesncf.xspeedit.utils.UtilsXspeedit;

@RunWith(MockitoJUnitRunner.class)
public class RobotFirstFitTest {
	
	
	
	 String chaineArticle = "163841689525773";
	 String chaineArticleEmballerRobotActuel = "163/8/41/6/8/9/52/5/7/73";
	 
	 
	 @Mock
	 UtilsXspeedit gUtilsXspeedit;
	 
	 @InjectMocks
     RobotFitFirst gRobotFitFirst;
	
	 
	@Test
	public void testRobotFitFirst() {
		when(gUtilsXspeedit.conertirChainEnIntegerArray(chaineArticle)).thenReturn(new int[] {1,6,3,8,4,1,6,8,9,5,2,5,7,7,3});
		
		String[] vRp= gRobotFitFirst.emballeCarton(chaineArticle);
		
		assertEquals(8, vRp.length);
		
	}

	 
	 
	 
	 
}
