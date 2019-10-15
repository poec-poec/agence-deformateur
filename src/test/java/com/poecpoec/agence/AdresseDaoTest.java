/**
 * 
 */
package com.poecpoec.agence;

import static org.junit.Assert.fail;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.poecpoec.agence.dao.AdresseDao;
import com.poecpoec.agence.model.Adresse;

/**
 * @author Seme
 *
 */
public class AdresseDaoTest
{

    /**
     * @throws java.lang.Exception
     */
    @BeforeClass
    public static void setUpBeforeClass() throws Exception
    {
    }

    /**
     * @throws java.lang.Exception
     */
    @AfterClass
    public static void tearDownAfterClass() throws Exception
    {
    }

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception
    {
    }

    /**
     * @throws java.lang.Exception
     */
    @After
    public void tearDown() throws Exception
    {
    }

    /**
     * Test method for {@link com.poecpoec.agence.dao.AdresseDao#findAll()}.
     */
    @Test
    public void testFindAll()
    {
        AdresseDao dao = new AdresseDao();
        List<Adresse> adresses = dao.findAll();
    }

    /**
     * Test method for
     * {@link com.poecpoec.agence.dao.AdresseDao#findByClientId(int)}.
     */
    @Test
    public void testFindByClientId()
    {
        fail("Not yet implemented");
    }

    /**
     * Test method for {@link com.poecpoec.agence.dao.AdresseDao#findById(int)}.
     */
    @Test
    public void testFindById()
    {
        fail("Not yet implemented");
    }

}
