package test;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.*;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import addressbook.univrouen.fr.addressbook.AddressbookFactory;
import addressbook.univrouen.fr.addressbook.AdressBook;
import addressbook.univrouen.fr.addressbook.Adresse;
import addressbook.univrouen.fr.addressbook.Personne;

public class AddressbookTest {
	@Test
	public void createAddressbookTest() {
	  AdressBook carnet = AddressbookFactory.eINSTANCE.createAdressBook();
	  carnet.setName("MonCarnet");
	    // Création d'une adresse
	  Adresse adr1 = AddressbookFactory.eINSTANCE.createAdresse();
	  adr1.setNumero(11);
	  adr1.setRue("siegfried");
	  
	  Adresse adr2 = AddressbookFactory.eINSTANCE.createAdresse();
	  adr2.setNumero(12);
	  adr2.setRue("siegfried 2");
	  
	  Adresse adr3 = AddressbookFactory.eINSTANCE.createAdresse();
	  adr2.setNumero(13);
	  adr2.setRue("siegfried 3");
	  
	    // Création d'une personne   
	  Personne pers1 = AddressbookFactory.eINSTANCE.createPersonne();
	  pers1.setAdresse(adr1);
	  pers1.setNom("first");
	  pers1.setPrenom("last");
	  pers1.setAge(23);
	  
	  Personne pers2 = AddressbookFactory.eINSTANCE.createPersonne();
	  pers2.setAdresse(adr2);
	  pers2.setNom("first");
	  pers2.setPrenom("last");
	  pers2.setAge(22);
	  
	  Personne pers3 = AddressbookFactory.eINSTANCE.createPersonne();
	  pers3.setAdresse(adr3);
	  pers3.setNom("first");
	  pers3.setPrenom("last");
	  pers3.setAge(21);
	   // Ajout personne / adresse dans carnet
	  carnet.getPersonne().add(pers1);
	  carnet.getPersonne().add(pers2);
	  carnet.getPersonne().add(pers3);
	  // Affichage du contenu de carnet - affichez les valeurs suivantes :
	assertEquals(carnet.getName(), "MonCarnet");
	
	assertEquals(carnet.getPersonne().size(), 3);
	
	assertEquals(carnet.getPersonne().get(0).display(), pers1.display());
	assertEquals(carnet.getPersonne().get(1).display(), pers2.display());
	assertEquals(carnet.getPersonne().get(2).display(), pers3.display());
	
	assertEquals(carnet.getPersonne().get(0).getAdresse().Display(), adr1.Display());
	assertEquals(carnet.getPersonne().get(1).getAdresse().Display(), adr2.Display());
	assertEquals(carnet.getPersonne().get(2).getAdresse().Display(), adr3.Display());
		
	ResourceSet resourceSet = new ResourceSetImpl();
	resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("addressbook", new XMIResourceFactoryImpl());
	
	// veuillez specifier le chemain de sauvgarde du fichier xml
	String path = ""; 
	URI uri = URI.createURI("file:/"+path+"/carnet.addressbook");
	Resource resource = resourceSet.createResource(uri);
	resource.getContents().add(carnet);
	try {
		resource.save(null);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	//verification de la creation du ficher
	assertTrue(new File(path+"/carnet.addressbook").exists());
	
	// mettre le fichier 
	AdressBook carnet2 = (AdressBook) resource.getContents().get(0);
	assertEquals(carnet, carnet2);
	}
}