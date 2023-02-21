package com.ironhack.Lab308.repository;

import com.ironhack.Lab308.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long > {

}
