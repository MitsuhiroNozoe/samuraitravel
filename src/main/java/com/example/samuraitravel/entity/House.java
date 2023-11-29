package com.example.samuraitravel.entity;
import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
//2から10は必要なインポート
 
@Entity //テーブルにレコードを扱うため
@Table(name = "houses") //そのテーブルはなんと言うテーブルなのかを表している
@Data //テーブルのデータをセットまたはゲットするもの

public class House {
    @Id //テーブルに対して主キー、一意
    @GeneratedValue(strategy = GenerationType.IDENTITY) //自動的に番号を振ってくれる機能
    @Column(name = "id") //どれに紐づくか、Javaのカラムと変数を紐づけているかたち
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "image_name")
    private String imageName;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private Integer price;

    @Column(name = "capacity")
    private Integer capacity;

    @Column(name = "postal_code")
    private String postalCode;

    @Column(name = "address")
    private String address;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "created_at", insertable = false, updatable = false)
    private Timestamp createdAt;

    @Column(name = "updated_at", insertable = false, updatable = false)
    private Timestamp updatedAt;
}
