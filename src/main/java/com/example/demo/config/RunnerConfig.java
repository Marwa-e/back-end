package com.example.demo.config;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.dao.AdresseRepository;
import com.example.demo.dao.CategorieRepository;
import com.example.demo.dao.CommandeRepository;
import com.example.demo.dao.EntrepriseRepository;
import com.example.demo.dao.FormateurRepository;
import com.example.demo.dao.FormationRepository;
import com.example.demo.dao.InternauteRepository;
import com.example.demo.dao.NiveauRepository;
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

		Formateur leFormateur = new Formateur("Sylvie", "Aubert", "sylvieaubert@gmail.fr", "0625451254");
		Formateur leFormateur1 = new Formateur("Regina", "Santomatte", "@ReginaSantomattegmail.com", "0524585774");
		Formateur leFormateur2 = new Formateur("Sisi", "Mosquito", "SisiMosquito@gmail.fr", "5235689545");
		Formateur leFormateur3 = new Formateur("Carole", "Lamar", "LamarCarole@gmail.fr", "0256352457");
		Formateur leFormateur4 = new Formateur("Gilles", "Lamar", "LamarGilles@gmail.com", "5241253685");
		Formateur leFormateur5 = new Formateur("robert", "silous", "robertsilous@gmail.fr", "4125457845");
		Formateur leFormateur6 = new Formateur("eric", "frutier", "ericfrutier@gmail.fr", "1245021245");
		Formateur leFormateur7 = new Formateur("gaëlle", "Lamar", "Lamargaëlle@gmail.com", "0635245878");

		nvRepository.save(new Niveau("xs"));
		nvRepository.save(new Niveau("s"));
		nvRepository.save(new Niveau("m"));
		nvRepository.save(new Niveau("ml"));
		nvRepository.save(new Niveau("l"));
		nvRepository.save(new Niveau("xl"));
		nvRepository.save(new Niveau("xxl"));

		// Catégorie INITIALE
		Categorie mere = new Categorie("Categories");
		catRepository.save(mere);

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

		catRepository.save(dev);

		catRepository.save(dev1);
		catRepository.save(dev2);
		catRepository.save(dev3);
		catRepository.save(dev4);
		catRepository.save(dev5);
		catRepository.save(dev6);

		Categorie sgbd = new Categorie("SGBD", mere);
		Categorie sgbd1 = new Categorie("Mysql et requetes");
		Categorie sgbd2 = new Categorie("Oracle");
		Categorie sgbd3 = new Categorie("NoSql");
		Categorie sgbd4 = new Categorie("JSON-SERVER");
		sgbd1.setMere(sgbd);
		sgbd2.setMere(sgbd);
		sgbd3.setMere(sgbd);
		sgbd4.setMere(sgbd);

		catRepository.save(sgbd);
		catRepository.save(sgbd1);
		catRepository.save(sgbd2);
		catRepository.save(sgbd3);
		catRepository.save(sgbd4);

		Categorie ia = new Categorie("IA", mere);
		Categorie ia1 = new Categorie("Réseau de neuronnes");
		Categorie ia2 = new Categorie("BigData");
		Categorie ia3 = new Categorie("Comment utiliser L'Ia");

		catRepository.save(ia);
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

		catRepository.save(softskill);
		catRepository.save(caodao);
		catRepository.save(d3);
		catRepository.save(secAdm);
		catRepository.save(linuxAdmin);
		catRepository.save(busi);
		catRepository.save(devsec);
		catRepository.save(ia1);
		catRepository.save(ia2);
		catRepository.save(ia3);

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
		adrRepository.save(adresse1);

		adresse2.setRue("avenue St Roch");
		adresse2.setCp("06100");
		adresse2.setVille("Nice");
		adresse2.setPays("france");
		adrRepository.save(adresse2);

		adresse3.setRue("chemin de troie");
		adresse3.setCp("75000");
		adresse3.setVille("Paris 1");
		adresse3.setPays("france");
		adrRepository.save(adresse3);

		adresse4.setRue("boulevard René Cassin");
		adresse4.setCp("13127");
		adresse4.setVille("Marseille");
		adresse4.setPays("france");
		adrRepository.save(adresse4);

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

		cmdRepository.save(commande);
		cmdRepository.save(commande1);
		cmdRepository.save(commande2);
		cmdRepository.save(commande3);

		Formation f1 = new Formation(ia1, "TYPES SCRIPT", "Developpez Angular Framework", leFormateur);
		fmRepository.save(f1);

		commande1.setSolde(15324D);

		Formation f2 = new Formation(ia2, "PHP", "Site Dynamique", leFormateur1);

		fmRepository.save(f2);
		commande2.setSolde(11002D);

		Formation f3 = new Formation(ia3, "PYTHON", "Developpez Django Framework", leFormateur2);

		fmRepository.save(f3);
		commande.setSolde(44425D);
		commande3.setSolde(13245D);

		Formation f0 = new Formation(ia, "JAVA JEE", "Devellopement SPRING BOOT", leFormateur3);
		fmRepository.save(f0);

		Formation formation = new Formation("Devenez développeur le Kotlin",
				"Les bases et les bonnes pratiques du langage.");
		formation.setDuree(42);
		formation.setNiveau("xl");
		formation.setCategorie(dev5);
		fmRepository.save(formation);

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

		internauteRepository.save(internaute);
		internauteRepository.save(i1);
		internauteRepository.save(i2);
		internauteRepository.save(i3);
		internauteRepository.save(i4);
		internauteRepository.save(i5);
		internauteRepository.save(i6);
		internauteRepository.save(i7);
		internauteRepository.save(i8);

		entrepriseRepository.save(entreprise);

		frRepository.save(new Formateur("Lucas", "Lamar", "LucasLamar@gmail.com", "0625458724"));
		frRepository.save(new Formateur("Gilles", "Lamar", "LamarGilles@gmail.com", "5241253685"));
		frRepository.save(new Formateur("robert", "silous", "robertsilous@gmail.fr", "4125457845"));
		frRepository.save(new Formateur("eric", "frutier", "ericfrutier@gmail.fr", "1245021245"));
		frRepository.save(new Formateur("gaëlle", "Lamar", "Lamargaëlle@gmail.com", "0635245878"));

		frRepository.save(leFormateur);
		leFormateur.setCategorie(devsec);
		frRepository.save(leFormateur);

		frRepository.save(leFormateur1);
		leFormateur1.setCategorie(ia);
		frRepository.save(leFormateur1);

		frRepository.save(leFormateur2);
		leFormateur2.setCategorie(sgbd2);
		frRepository.save(leFormateur2);

		frRepository.save(leFormateur3);
		leFormateur3.setCategorie(sgbd3);
		frRepository.save(leFormateur3);

		frRepository.save(leFormateur4);
		leFormateur4.setCategorie(sgbd4);
		frRepository.save(leFormateur4);

		frRepository.save(leFormateur5);
		leFormateur5.setCategorie(linuxAdmin);
		frRepository.save(leFormateur5);

		frRepository.save(leFormateur6);
		leFormateur6.setCategorie(secAdm);
		frRepository.save(leFormateur6);

		frRepository.save(leFormateur7);
		leFormateur7.setCategorie(busi);
		frRepository.save(leFormateur7);

		Adresse adresseFormation = new Adresse();
		adresseFormation.setRue("chemin du pinçon");
		adresseFormation.setVille("Bastia");
		adresseFormation.setCp("20000");
		adresseFormation.setPays("france");

		formation.setLieux(adresseFormation);
		formation.setPrix(14235D);

		List<Formateur> formateurs = new ArrayList<>();
		formateurs.add(leFormateur3);
		formation.setFormateur(leFormateur7);

		formation.setCategorie(devsec);
		commande2.setFormation(f0);
		commande.setFormation(formation);
		//commande2.setFormation(f1);

		cmdRepository.save(commande2);
		cmdRepository.save(commande);

		internauteRepository.save(new Internaute("Sophia", "calage", "xl"));
		internauteRepository.save(new Internaute("Jerome", "leclerc", "l"));
		internauteRepository.save(new Internaute("Charles", "saugier", "xs"));
		internauteRepository.save(new Internaute("Loubna", "rameur", "s"));
		internauteRepository.save(new Internaute("marwa", "carre", "xxl"));
		internauteRepository.save(new Internaute("julie", "solies", "xl"));

		System.out.println(
				"***************************************************   LISTE DES INTERNAUTES  ********************************************************************");
		internauteRepository.findAll().forEach((p) -> {
			System.out.println(p.getNom() + ", " + p.getPrenom());
		});

		System.out.println(
				"***************************************************   LISTE DES FORMATIONS EN COMMANDES  ********************************************************************");
		cmdRepository.findAll().forEach((c) -> {
			try {
				Formation forma = c.getFormation();
				System.out.println(forma.getIntitule() + ", " + forma.getDescriptif() + " : " + (c.getSolde())+c.getId());

			} catch (Exception e) {
				System.out.println("pas d'info");
			}
			
		});

//
		System.out.println(
				"*************************************************************************************************************************************************");
		System.out.println(
				"***************************************************************  Les FORMATIONS *****************************************************************");
		System.out.println(
				"*************************************************************************************************************************************************");

		fmRepository.findAll().forEach((fm) -> {
			System.out.println("Intitule de la formation: " + fm.getIntitule().toString() + " :: "
					+ fm.getDescriptif().toString());
			System.out.println("Prix: " + fm.getPrix() + " :: Duree: " + fm.getDuree());
			System.out.println("Intitule de la catégorie: " + fm.getCategorie().getIntitule() + " :: idCategorie: "
					+ fm.getCategorie().getId() + "  ::  intituléCatégorieMere: "
					+ fm.getCategorie().getMere().getIntitule() + "  ::  idCatégorieMere: "
					+ fm.getCategorie().getMere().getId());
			try {
				System.out.println("FORMATEUR: " + fm.getFormateur().getPrenom() + ", " + fm.getFormateur().getNom());
				System.out
						.println("Catégorie(intitulé) du formateur: " + fm.getFormateur().getCategorie().getIntitule());
			} catch (Exception e) {
				System.out.println("Pas encore de formateur affecté");
			}
			System.out.println(
					"---------------------------------------------------------------------------------------------------------------------------------------------");
		});
	}

}