/**
 */
package addressbook.univrouen.fr.addressbook.impl;

import addressbook.univrouen.fr.addressbook.AddressbookFactory;
import addressbook.univrouen.fr.addressbook.AddressbookPackage;
import addressbook.univrouen.fr.addressbook.AdressBook;
import addressbook.univrouen.fr.addressbook.Adresse;
import addressbook.univrouen.fr.addressbook.Personne;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AddressbookPackageImpl extends EPackageImpl implements AddressbookPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adresseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adressBookEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see addressbook.univrouen.fr.addressbook.AddressbookPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AddressbookPackageImpl() {
		super(eNS_URI, AddressbookFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link AddressbookPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AddressbookPackage init() {
		if (isInited) return (AddressbookPackage)EPackage.Registry.INSTANCE.getEPackage(AddressbookPackage.eNS_URI);

		// Obtain or create and register package
		AddressbookPackageImpl theAddressbookPackage = (AddressbookPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AddressbookPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AddressbookPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theAddressbookPackage.createPackageContents();

		// Initialize created meta-data
		theAddressbookPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAddressbookPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AddressbookPackage.eNS_URI, theAddressbookPackage);
		return theAddressbookPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdresse() {
		return adresseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdresse_Numero() {
		return (EAttribute)adresseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdresse_Rue() {
		return (EAttribute)adresseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAdresse__Display() {
		return adresseEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersonne() {
		return personneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonne_Nom() {
		return (EAttribute)personneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonne_Prenom() {
		return (EAttribute)personneEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonne_Age() {
		return (EAttribute)personneEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonne_Adresse() {
		return (EReference)personneEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonne_Identifier() {
		return (EAttribute)personneEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPersonne__Display() {
		return personneEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdressBook() {
		return adressBookEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdressBook_Name() {
		return (EAttribute)adressBookEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdressBook_Personne() {
		return (EReference)adressBookEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAdressBook__AddContact() {
		return adressBookEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAdressBook__RemoveContact() {
		return adressBookEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressbookFactory getAddressbookFactory() {
		return (AddressbookFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		adresseEClass = createEClass(ADRESSE);
		createEAttribute(adresseEClass, ADRESSE__NUMERO);
		createEAttribute(adresseEClass, ADRESSE__RUE);
		createEOperation(adresseEClass, ADRESSE___DISPLAY);

		personneEClass = createEClass(PERSONNE);
		createEAttribute(personneEClass, PERSONNE__NOM);
		createEAttribute(personneEClass, PERSONNE__PRENOM);
		createEAttribute(personneEClass, PERSONNE__AGE);
		createEReference(personneEClass, PERSONNE__ADRESSE);
		createEAttribute(personneEClass, PERSONNE__IDENTIFIER);
		createEOperation(personneEClass, PERSONNE___DISPLAY);

		adressBookEClass = createEClass(ADRESS_BOOK);
		createEAttribute(adressBookEClass, ADRESS_BOOK__NAME);
		createEReference(adressBookEClass, ADRESS_BOOK__PERSONNE);
		createEOperation(adressBookEClass, ADRESS_BOOK___ADD_CONTACT);
		createEOperation(adressBookEClass, ADRESS_BOOK___REMOVE_CONTACT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(adresseEClass, Adresse.class, "Adresse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAdresse_Numero(), ecorePackage.getEInt(), "numero", null, 0, 1, Adresse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdresse_Rue(), ecorePackage.getEString(), "rue", null, 0, 1, Adresse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAdresse__Display(), ecorePackage.getEString(), "Display", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(personneEClass, Personne.class, "Personne", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPersonne_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, Personne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersonne_Prenom(), ecorePackage.getEString(), "prenom", null, 0, 1, Personne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersonne_Age(), ecorePackage.getEInt(), "age", "0", 0, 1, Personne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersonne_Adresse(), this.getAdresse(), null, "adresse", null, 1, 1, Personne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPersonne_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1, Personne.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEOperation(getPersonne__Display(), ecorePackage.getEString(), "display", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(adressBookEClass, AdressBook.class, "AdressBook", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAdressBook_Name(), ecorePackage.getEString(), "name", null, 0, 1, AdressBook.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdressBook_Personne(), this.getPersonne(), null, "personne", null, 0, -1, AdressBook.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAdressBook__AddContact(), ecorePackage.getEBoolean(), "addContact", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAdressBook__RemoveContact(), null, "removeContact", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "ecore", "http://www.eclipse.org/emf/2002/Ecore"
		   });
	}

} //AddressbookPackageImpl
