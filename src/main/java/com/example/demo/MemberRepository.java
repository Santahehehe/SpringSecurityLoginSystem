package com.example.demo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

//在 MongoRepository 介面中，已經內含 findById、deleteById 等多個方法。
//此處我們自行宣告了叫做「findByUsername」的方法，代表要查詢 username 欄位相等的資料。
@Repository
public interface MemberRepository extends MongoRepository<Member, String> {
    Member findByUsername(String username);
}