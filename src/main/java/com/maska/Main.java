package com.maska;

import com.maska.config.AppConfig;
import com.maska.model.Member;
import com.maska.service.MemberService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialiser le contexte Spring avec la configuration
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Obtenir le bean MemberService
        MemberService memberService = context.getBean(MemberService.class);

 //         Créer un nouvel objet Member
        Member member = new Member();
        member.setMembershipNumber("M123456");
        member.setLastName("Doe");
        member.setFirstName("John");
        member.setIdentificationDocument("ID123456789");
        member.setNationality("French");
        member.setMembershipDate(LocalDate.now());
        member.setLicenseExpirationDate(LocalDate.now().plusYears(1));

        // Sauvegarder le membre dans la base de données
        memberService.create(member);

//        // Récupérer le membre par ID
//        Member member = memberService.findById(1L);

//        // Récupérer et afficher tous les membres
//        List<Member> members = memberService.findAll();

//        // Mettre à jour le membre
//        Member member = memberService.findById(1L);
//
//        member.setMembershipNumber("BB212895");
//        member.setLastName("Mohammed");
//        member.setFirstName("Miessal");
//        member.setIdentificationDocument("ID123456789");
//        member.setNationality("Moroccan");
//        member.setMembershipDate(LocalDate.of(2003, 6, 18));
//        member.setLicenseExpirationDate(LocalDate.of(2024, 10, 23));
//
//        memberService.update(member);


        // Afficher les détails du membre
//        System.out.println("Member saved successfully!");

        System.out.println(member);

        // Fermer le contexte
        context.close();



//        // Récupérer et afficher tous les membres
//        List<Member> members = memberService.findAll();
//        System.out.println("All members: " + members);
//
//        // Mettre à jour le membre
//        newMember.setLastName("Smith");
//        memberService.update(newMember);
//        System.out.println("Member updated: " + newMember);
//
//        // Récupérer le membre par ID
//        Member foundMember = memberService.findById(newMember.getId());
//        System.out.println("Found member: " + foundMember);
//
//        // Supprimer le membre
//        memberService.delete(newMember.getId());
//        System.out.println("Member deleted.");
//
//        // Afficher tous les membres après la suppression
//        members = memberService.findAll();
//        System.out.println("All members after deletion: " + members);
//
    }
}
