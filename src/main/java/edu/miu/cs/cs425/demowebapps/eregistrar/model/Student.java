package edu.miu.cs.cs425.demowebapps.eregistrar.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Student {

 @Id
 @GeneratedValue (strategy = GenerationType.IDENTITY)
   private Long  studentId ; // (should be the primary key field)

    private String studentNumber; //e.g. 000-61-0001 (required)

    private String firstName ; // e.g. Anna (required)

    private String middleName; // (optional)

    private String lastName; // e.g. Smith (required)

    private double cgpa; // e.g. 3.78 (optional)

    private LocalDate enrollmentDate ; //  e.g. 2019-5-12 (required)


    @Enumerated(EnumType.STRING)
    private  International isInternational;
     //(values: "Yes", "No") (required) - Hint: Implement/present this data in a drop-down list or Radio button


 public Long getStudentId() {
  return studentId;
 }

 public void setStudentId(Long studentId) {
  this.studentId = studentId;
 }

 public String getStudentNumber() {
  return studentNumber;
 }

 public void setStudentNumber(String studentNumber) {
  this.studentNumber = studentNumber;
 }

 public String getFirstName() {
  return firstName;
 }

 public void setFirstName(String firstName) {
  this.firstName = firstName;
 }

 public String getMiddleName() {
  return middleName;
 }

 public void setMiddleName(String middleName) {
  this.middleName = middleName;
 }

 public String getLastName() {
  return lastName;
 }

 public void setLastName(String lastName) {
  this.lastName = lastName;
 }

 public double getCgpa() {
  return cgpa;
 }

 public void setCgpa(double cgpa) {
  this.cgpa = cgpa;
 }

 public LocalDate getEnrollmentDate() {
  return enrollmentDate;
 }

 public void setEnrollmentDate(LocalDate enrollmentDate) {
  this.enrollmentDate = enrollmentDate;
 }

 public International getIsInternational() {
  return isInternational;
 }

 public void setIsInternational(International isInternational) {
  this.isInternational = isInternational;
 }

 public Student(Long studentId, String studentNumber, String firstName, String middleName, String lastName, double cgpa, LocalDate enrollmentDate, International isInternational) {
  this.studentId = studentId;
  this.studentNumber = studentNumber;
  this.firstName = firstName;
  this.middleName = middleName;
  this.lastName = lastName;
  this.cgpa = cgpa;
  this.enrollmentDate = enrollmentDate;
  this.isInternational = isInternational;
 }

 public Student() {
 }

 @Override
 public String toString() {
  return "Student{" +
          "studentId=" + studentId +
          ", studentNumber='" + studentNumber + '\'' +
          ", firstName='" + firstName + '\'' +
          ", middleName='" + middleName + '\'' +
          ", lastName='" + lastName + '\'' +
          ", cgpa=" + cgpa +
          ", enrollmentDate=" + enrollmentDate +
          ", isInternational=" + isInternational +
          '}';
 }
}
