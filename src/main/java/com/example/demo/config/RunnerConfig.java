package com.example.demo.config;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.example.demo.dao.AdresseRepository;
import com.example.demo.dao.CategorieRepository;
import com.example.demo.dao.CommandeRepository;
import com.example.demo.dao.EmailRepository;
import com.example.demo.dao.EntrepriseRepository;
import com.example.demo.dao.FormateurRepository;
import com.example.demo.dao.FormationRepository;
import com.example.demo.dao.InternauteRepository;
import com.example.demo.dao.LienTestRepository;
import com.example.demo.dao.NiveauRepository;
import com.example.demo.dao.TelephoneRepository;
import com.example.demo.entities.Adresse;
import com.example.demo.entities.Categorie;
import com.example.demo.entities.Commande;
import com.example.demo.entities.Entreprise;
import com.example.demo.entities.Formateur;
import com.example.demo.entities.Formation;
import com.example.demo.entities.Internaute;
import com.example.demo.entities.Niveau;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class RunnerConfig implements CommandLineRunner {

	@Autowired
	private NiveauRepository nvRepository;

	@Autowired
	private AdresseRepository adrRepository;

	@Autowired
	private InternauteRepository internauteRepository;

	@Autowired
	private EntrepriseRepository entrepriseRepository;

	@Autowired
	private CommandeRepository cmdRepository;

	@Autowired
	private CategorieRepository catRepository;

	@Autowired
	private FormationRepository fmRepository;

	@Autowired
	private FormateurRepository frRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		nvRepository.saveAndFlush(new Niveau("xs"));
		nvRepository.saveAndFlush(new Niveau("s"));
		nvRepository.saveAndFlush(new Niveau("m"));
		nvRepository.saveAndFlush(new Niveau("ml"));
		nvRepository.saveAndFlush(new Niveau("l"));
		nvRepository.saveAndFlush(new Niveau("xl"));
		nvRepository.saveAndFlush(new Niveau("xxl"));

		// Catégorie INITIALE
		Categorie mere = new Categorie("Categories");
		catRepository.saveAndFlush(mere);

		Categorie dev = new Categorie("Developpement", mere);
		Categorie dev1 = new Categorie("Les bases de C++");
		Categorie dev2 = new Categorie("Appli Et Micro Services JAVA SPRING BOOT");
		Categorie dev3 = new Categorie("Appli Microsoft C# .NET");
		Categorie dev4 = new Categorie("FRONT ET BACK Avec PYTHON - DJANGO");
		Categorie dev5 = new Categorie("FRONT-END Avec ANGULAR JSON HTML5 TYPESCRIPT");
		Categorie dev6 = new Categorie("Apprendre GO");

		dev1.setMere(dev);
		dev2.setMere(dev);
		dev3.setMere(dev);
		dev4.setMere(dev);
		dev5.setMere(dev);
		dev6.setMere(dev);

		catRepository.saveAndFlush(dev);

		catRepository.saveAndFlush(dev1);
		catRepository.saveAndFlush(dev2);
		catRepository.saveAndFlush(dev3);
		catRepository.saveAndFlush(dev4);
		catRepository.saveAndFlush(dev5);
		catRepository.saveAndFlush(dev6);

		Categorie sgbd = new Categorie("SGBD", mere);
		Categorie sgbd1 = new Categorie("Mysql et requetes");
		Categorie sgbd2 = new Categorie("Oracle");
		Categorie sgbd3 = new Categorie("NoSql");
		Categorie sgbd4 = new Categorie("JSON-SERVER");
		sgbd1.setMere(sgbd);
		sgbd2.setMere(sgbd);
		sgbd3.setMere(sgbd);
		sgbd4.setMere(sgbd);

		catRepository.saveAndFlush(sgbd);
		catRepository.saveAndFlush(sgbd1);
		catRepository.saveAndFlush(sgbd2);
		catRepository.saveAndFlush(sgbd3);
		catRepository.saveAndFlush(sgbd4);

		Categorie ia = new Categorie("IA", mere);
		Categorie ia1 = new Categorie("Réseau de neuronnes");
		Categorie ia2 = new Categorie("BigData");
		Categorie ia3 = new Categorie("Comment utiliser L'Ia");

		catRepository.saveAndFlush(ia);
		ia1.setMere(ia);
		ia2.setMere(ia);
		ia3.setMere(ia);

		Categorie softskill = new Categorie("SoftSkill", mere);

		Categorie caodao = new Categorie("CAO-DAO", mere);

		Categorie d3 = new Categorie("3D", mere);

		Categorie secAdm = new Categorie("Sécurité / Administration", mere);

		Categorie linuxAdmin = new Categorie("Linux Administration", mere);

		Categorie busi = new Categorie("Business", mere);

		Categorie devsec = new Categorie("DevSecOps", mere);

		catRepository.saveAndFlush(softskill);
		catRepository.saveAndFlush(caodao);
		catRepository.saveAndFlush(d3);
		catRepository.saveAndFlush(secAdm);
		catRepository.saveAndFlush(linuxAdmin);
		catRepository.saveAndFlush(busi);
		catRepository.saveAndFlush(devsec);
		catRepository.saveAndFlush(ia1);
		catRepository.saveAndFlush(ia2);
		catRepository.saveAndFlush(ia3);

		List<Adresse> adresses1 = new ArrayList<Adresse>();
		List<Adresse> adresses2 = new ArrayList<Adresse>();

		Adresse adresse1 = new Adresse();
		Adresse adresse2 = new Adresse();
		Adresse adresse3 = new Adresse();
		Adresse adresse4 = new Adresse();

		adresse1.setRue("rue de la pissiculture");
		adresse1.setCp("83790");
		adresse1.setVille("Pignans");
		adresse1.setPays("france");
		adrRepository.saveAndFlush(adresse1);

		adresse2.setRue("avenue St Roch");
		adresse2.setCp("06100");
		adresse2.setVille("Nice");
		adresse2.setPays("france");
		adrRepository.saveAndFlush(adresse2);

		adresse3.setRue("chemin de troie");
		adresse3.setCp("75000");
		adresse3.setVille("Paris 1");
		adresse3.setPays("france");
		adrRepository.saveAndFlush(adresse3);

		adresse4.setRue("boulevard René Cassin");
		adresse4.setCp("13127");
		adresse4.setVille("Marseille");
		adresse4.setPays("france");
		adrRepository.saveAndFlush(adresse4);

		adresses1.add(adresse1);
		adresses1.add(adresse2);

		adresses2.add(adresse3);
		adresses2.add(adresse4);

		Internaute internaute = new Internaute("Eric", "bruneau", "ml");
		internaute.setEmail("ericbruneau@gmail.com");

		Commande commande = new Commande();
		Commande commande1 = new Commande();
		Commande commande2 = new Commande();
		Commande commande3 = new Commande();
		Formation f1 = new Formation("TYPES SCRIPT", "Developpez Angular Framework");
//		f1.setCategorie(ia1);

//		fmRepository.saveAndFlush(f1);
		commande1.setFormation(f1);
		commande1.setSolde(15324D);

		Formation f2 = new Formation("PHP", "Site Dynamique");
//		f2.setCategorie(dev4);

//		fmRepository.saveAndFlush(f2);
		commande2.setFormation(f2);
		commande2.setSolde(11002D);

		Formation f3 = new Formation("PYTHON", "Developpez Django Framework");
//		f3.setCategorie(dev4);

//		fmRepository.saveAndFlush(f3);
		commande3.setFormation(f3);
		commande.setSolde(44425D);
		commande3.setSolde(13245D);

		Formation f0 = new Formation("JAVA JEE", "Devellopement SPRING BOOT");
//		f0.setCategorie(dev6);
//		fmRepository.saveAndFlush(f0);
		commande.setFormation(f0);

		Formation formation = new Formation("Devenez développeur le Kotlin",
				"Les bases et les bonnes pratiques du langage.");
		formation.setDuree(42);
		formation.setNiveau("xl");
//		formation.setCategorie(dev5);
//		fmRepository.saveAndFlush(formation);

		cmdRepository.saveAndFlush(commande);
		cmdRepository.saveAndFlush(commande1);
		cmdRepository.saveAndFlush(commande2);
		cmdRepository.saveAndFlush(commande3);

		internaute.setCurrentCommande(commande);

		Entreprise entreprise = new Entreprise();
		entreprise.setRaisonSociale("LE MONDE DES BISOUNOURS");
		entreprise.setContactEntrepriseNom("LEMOINS");
		entreprise.setContactEntreprisePrenom("ludovic");
		internaute.setTelephone("0425658985");

		Internaute i1 = new Internaute("Georges", "De La Jungle", "s");
		Internaute i2 = new Internaute("Sisi", "L'impératrice", "l");
		Internaute i3 = new Internaute("Sacha", "Faitout", "s");
		Internaute i4 = new Internaute("Armand", "lucier", "xxxl");
		Internaute i5 = new Internaute("farah", "Mineuse", "xxl");
		Internaute i6 = new Internaute("Talaron", "delphine", "xs");
		Internaute i7 = new Internaute("Sigmund", "Freud", "s");
		Internaute i8 = new Internaute("Georges", "Washington", "xl");

		i8.setAdresse(adresse4);
		i8.setTelephone("0425125474");
		i8.setEmail("georgesWash@gmail.com");

		i4.setAdresse(adresse3);
		i6.setAdresse(adresse2);

		internauteRepository.saveAndFlush(internaute);
		internauteRepository.saveAndFlush(i1);
		internauteRepository.saveAndFlush(i2);
		internauteRepository.saveAndFlush(i3);
		internauteRepository.saveAndFlush(i4);
		internauteRepository.saveAndFlush(i5);
		internauteRepository.saveAndFlush(i6);
		internauteRepository.saveAndFlush(i7);
		internauteRepository.saveAndFlush(i8);

		entrepriseRepository.saveAndFlush(entreprise);

		frRepository.saveAndFlush(new Formateur("Lucas", "Lamar", "LucasLamar@gmail.com", "0625458724"));
		frRepository.saveAndFlush(new Formateur("Gilles", "Lamar", "LamarGilles@gmail.com", "5241253685"));
		frRepository.saveAndFlush(new Formateur("robert", "silous", "robertsilous@gmail.fr", "4125457845"));
		frRepository.saveAndFlush(new Formateur("eric", "frutier", "ericfrutier@gmail.fr", "1245021245"));
		frRepository.saveAndFlush(new Formateur("gaëlle", "Lamar", "Lamargaëlle@gmail.com", "0635245878"));

		Formateur leFormateur = new Formateur("Sylvie", "Aubert", "sylvieaubert@gmail.fr", "0625451254");
		frRepository.saveAndFlush(leFormateur);
		leFormateur.setCategorie(devsec);
		frRepository.saveAndFlush(leFormateur);

		Formateur leFormateur1 = new Formateur("Regina", "Santomatte", "@ReginaSantomattegmail.com", "0524585774");
		frRepository.saveAndFlush(leFormateur1);
		leFormateur1.setCategorie(ia);
		frRepository.saveAndFlush(leFormateur1);

		Formateur leFormateur2 = new Formateur("Sisi", "Mosquito", "SisiMosquito@gmail.fr", "5235689545");
		frRepository.saveAndFlush(leFormateur2);
		leFormateur2.setCategorie(sgbd2);
		frRepository.saveAndFlush(leFormateur2);

		Formateur leFormateur3 = new Formateur("Carole", "Lamar", "LamarCarole@gmail.fr", "0256352457");
		frRepository.saveAndFlush(leFormateur3);
		leFormateur3.setCategorie(sgbd3);
		frRepository.saveAndFlush(leFormateur3);

		Formateur leFormateur4 = new Formateur("Gilles", "Lamar", "LamarGilles@gmail.com", "5241253685");
		frRepository.saveAndFlush(leFormateur4);
		leFormateur4.setCategorie(sgbd4);
		frRepository.saveAndFlush(leFormateur4);

		Formateur leFormateur5 = new Formateur("robert", "silous", "robertsilous@gmail.fr", "4125457845");
		frRepository.saveAndFlush(leFormateur5);
		leFormateur5.setCategorie(linuxAdmin);
		frRepository.saveAndFlush(leFormateur5);

		Formateur leFormateur6 = new Formateur("eric", "frutier", "ericfrutier@gmail.fr", "1245021245");
		frRepository.saveAndFlush(leFormateur6);
		leFormateur6.setCategorie(secAdm);
		frRepository.saveAndFlush(leFormateur6);

		Formateur leFormateur7 = new Formateur("gaëlle", "Lamar", "Lamargaëlle@gmail.com", "0635245878");
		frRepository.saveAndFlush(leFormateur7);
		leFormateur7.setCategorie(busi);
		frRepository.saveAndFlush(leFormateur7);

		Adresse adresseFormation = new Adresse();
		adresseFormation.setRue("chemin du pinçon");
		adresseFormation.setVille("Bastia");
		adresseFormation.setCp("20000");
		adresseFormation.setPays("france");

		formation.setLieux(adresseFormation);
		formation.setPrix(14235D);

//		List<Formateur> formateurs = new ArrayList<>();
//		formateurs.add(leFormateur3);
		formation.setFormateur(leFormateur7);

		formation.setCategorie(devsec);

		// commande2.getFormation().setCategorie(dev);
		cmdRepository.saveAndFlush(commande2);

		internauteRepository.saveAndFlush(new Internaute("Sophia", "calage", "xl"));
		internauteRepository.saveAndFlush(new Internaute("Jerome", "leclerc", "l"));
		internauteRepository.saveAndFlush(new Internaute("Charles", "saugier", "xs"));
		internauteRepository.saveAndFlush(new Internaute("Loubna", "rameur", "s"));
		internauteRepository.saveAndFlush(new Internaute("marwa", "carre", "xxl"));
		internauteRepository.saveAndFlush(new Internaute("julie", "solies", "xl"));

		System.out.println("*******************************************************");
		internauteRepository.findAll().forEach((p) -> {
			System.out.println(p.getNom() + ", " + p.getPrenom());
		});

//		System.out.println("*******************************************************");
//		cmdRepository.findAll().forEach((c) -> {
//			Formation forma = c.getFormation();
//			try {
//				System.out.println(forma.getIntitule().toString() + ", " + forma.getDescriptif() + " : "
//						+ (c.getSolde().toString()));
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
//		});
//
//		System.out.println("*******************************************************");
//		Hibernate.initialize(fmRepository);
//		fmRepository.findAll().forEach((fm) -> {
//			System.out.println(fm.getIntitule().toString() + " :: " + fm.getDescriptif().toString());
//			System.out.println(fm.getPrix() + " :: " + fm.getDuree());
//			System.out.println("------------------------------------------------------");
//			System.out.println("Size de getFormateurs(): "+fm.getFormateur().getNom());
//		});


	}


}