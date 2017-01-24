package de.hrw.swep.biblio.persistence;

import static org.junit.Assert.*;

import java.io.File;
import java.sql.SQLException;
import java.util.Set;

import org.dbunit.Assertion;
import org.dbunit.IDatabaseTester;
import org.dbunit.JdbcDatabaseTester;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSetBuilder;
import org.junit.Before;
import org.junit.Test;

import de.hrw.swep.biblio.persistence.dto.BenutzerDTO;
import de.hrw.swep.biblio.persistence.dto.BuchDTO;

/**
 * Testklasse fuer den Datenbankzugriff
 * 
 * @author M. Friedrich
 *
 */
public class DAOTest {

  private IDatabaseTester databaseTester;
  private DAO dao;

  /**
   * Bringt die Datenbank in einen definierten Ausgangszustand
   * 
   * @throws Exception
   */
  @Before
  public void setup() throws Exception {
    dao = new DAO();
    databaseTester = new JdbcDatabaseTester("org.hsqldb.jdbcDriver",
        "jdbc:hsqldb:file:../biblio-db/database/bibdb", "sa", "");
    databaseTester.setDataSet(new FlatXmlDataSetBuilder().build(new File("full.xml")));
    databaseTester.onSetup();
  }

  /**
   * Testet das Abrufen eines bestimmten Nutzers nach der Nutzer-ID
   */
  @Test
  public void testGetUserById() {
    BenutzerDTO b = dao.getBenutzerById(1);
    assertEquals("Adalbert Alt", b.getName());
    assertEquals("Normal", b.getStatus());
  }

  /**
   * Testet das Abrufen eines Benutzers mit einem gegebenen Namen.
   */
  @Test
  public void testGetBenutzerByName() {
    fail();
  }

  /**
   * Testet das Abrufen aller Buecher eines Autors
   */
  @Test
  public void testGetBuchByAutor() {
    fail();
  }

  /**
   * Testet das Abrufen eines Buches nach dem Titel.
   */
  @Test
  public void testGetBuchByTitle() {
    fail();
  }

  /**
   * Testet ob ein neuer Benutzer in der Datenbank angelegt werden kann
   * 
   * @throws SQLException
   * 
   * @throws Exception
   */
  @Test
  public void testAddBenutzer() throws SQLException, Exception {
    fail();
  }

  /**
   * Testet ob ein neues Buch angelegt werden kann
   * 
   * @throws Exception
   * @throws SQLException
   */
  @Test
  public void testAddBuch() throws SQLException, Exception {
    fail();
  }

}
