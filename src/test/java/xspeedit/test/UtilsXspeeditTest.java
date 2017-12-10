package xspeedit.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

import com.voyagesncf.xspeedit.service.impl.RobotActuel;
import com.voyagesncf.xspeedit.utils.UtilsXspeedit;

@RunWith(MockitoJUnitRunner.class)
public class UtilsXspeeditTest {

	 private static final String chaineArticle = "163841689525773";
	 private static final String chaineArticleErronee = "1638416895-25773";
	 private static final String chaineArticleEmballerRobotActuel = "163/8/41/6/8/9/52/5/7/73";
	  
	 int[] responseConvertir = new int[] {1,6,3,8,4,1,6,8,9,5,2,5,7,7,3};
	 
	 
	 UtilsXspeedit vUtilsXspeedit;

	 @Mock
     RobotActuel vMockRobotActuel;
	
	 @Spy
	 UtilsXspeedit gSpyUtilsXspeedit;
	 
	 
		@Test
		public void testIsInValidIntegerList() {
			when(gSpyUtilsXspeedit.isValidIntegerSequence(null)).thenReturn(false);
			assertFalse(gSpyUtilsXspeedit.isValidIntegerSequence(null));
			
			
			when(gSpyUtilsXspeedit.isValidIntegerSequence("")).thenReturn(false);
			assertFalse(gSpyUtilsXspeedit.isValidIntegerSequence(""));
			
			when(gSpyUtilsXspeedit.isValidIntegerSequence(chaineArticleErronee)).thenReturn(false);
			assertFalse(gSpyUtilsXspeedit.isValidIntegerSequence(chaineArticleErronee));			
		}
		
		
		@Test
		public void testIsValidIntegerList() {
			when(gSpyUtilsXspeedit.isValidIntegerSequence(chaineArticle)).thenReturn(true);
			assertTrue(gSpyUtilsXspeedit.isValidIntegerSequence(chaineArticle));	
		}	
		
		
		@Test
		public void testConvertirChainEnIntegerArray() {
			when(gSpyUtilsXspeedit.conertirChainEnIntegerArray(chaineArticle)).thenReturn(responseConvertir);
			assertEquals(responseConvertir, gSpyUtilsXspeedit.conertirChainEnIntegerArray(chaineArticle));
		}
		
	 
		@Test
		public void testNombreDeCarton() {
			when(vMockRobotActuel.emballeCarton(chaineArticle)).thenReturn(chaineArticleEmballerRobotActuel);
			int vNombreCarton = gSpyUtilsXspeedit.getNombreCarton(chaineArticleEmballerRobotActuel);
			assertEquals(10, vNombreCarton);
		}
		
		@Test
		public void testGetNombreCarton() {
			when(gSpyUtilsXspeedit.getNombreCarton("")).thenReturn(0);
			assertEquals(0,gSpyUtilsXspeedit.getNombreCarton(""));
		}
		
		@Test
		public void testConvertirArrayIntegerEnChaine() {
			when(gSpyUtilsXspeedit.convertArrayIntEnChaine( new String[] {"163","82","46","19","8","55","73","7"}) ).thenReturn("163/82/46/19/8/55/73/7");
		}
		
			 
	
}
