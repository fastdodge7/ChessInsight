package com.example.chessinsight.chessgame.domain.entity;

import com.example.chessinsight.chessgame.domain.common.BaseEntity;
import jakarta.persistence.*;
import lombok.*;


@Getter
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "users")
public class User extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    private String nickname;

    private String profileUrl;

    @NonNull
    private String email;

    private boolean deletionFlag;

    public boolean softDeletion() {
        this.deletionFlag = true;
        return this.deletionFlag;
    }
}
