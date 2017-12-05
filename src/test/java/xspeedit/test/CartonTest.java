package xspeedit.test;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import com.voyagesncf.xspeedit.utils.UtilsXspeedit;


public class CartonTest {

	private static final String chaineArticle = "163841689525773";
	private UtilsXspeedit vUtilsXspeedit;


	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		vUtilsXspeedit = mock(UtilsXspeedit.class);
	}

	
	@Test
	public void testIsInValidIntegerList() {
		when(vUtilsXspeedit.isValidIntegerSequence(null)).thenReturn(false);
		assertFalse(vUtilsXspeedit.isValidIntegerSequence(null));	
	}
	
	
	@Test
	public void testIsValidIntegerList() {
		when(vUtilsXspeedit.isValidIntegerSequence(chaineArticle)).thenReturn(true);
		assertTrue(vUtilsXspeedit.isValidIntegerSequence(chaineArticle));	
	}
	
	

}
