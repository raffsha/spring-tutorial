package com.kanaex.springbootcrud;

        import lombok.Getter;
        import lombok.Setter;
        import lombok.ToString;

        import javax.persistence.*;

// The first step to work with data in database is to model it’s structure in JPA entity classes
// and create repository interfaces for them.
//
//Whenever possible, extend JpaRepository interface to allows to create
// repository implementations automatically, at runtime, for any given entity class.
// The types of entity class and it’s ID field are specified in the generic parameters on JpaRepository.
//
//Remember to include only JPA API annotations (javax.persistence.*)
//to de-couple hibernate from application code.

@Setter
@Getter
@ToString
@Entity
@Table(name = "TBL_EMPLOYEES")
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email", nullable = false, length = 200)
    private String email;

}
