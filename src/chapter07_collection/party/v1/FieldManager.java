package chapter07_collection.party.v1;

import chapter07_collection.party.Member;

import java.util.List;

class FieldManager {
  // パーティの最大メンバー数
  static final int MAX_MEMBER_COUNT = 4;

  // 中略

  // メンバーを追加する。
  void addMember(List<Member> members, Member newMember) {
    if (members.stream().anyMatch(member -> member.id == newMember.id)) {
      throw new RuntimeException("既にパーティに加わっています。");
    }
    if (members.size() == MAX_MEMBER_COUNT) {
      throw new RuntimeException("これ以上メンバーを追加できません。");
    }

    members.add(newMember);
  }

  // パーティメンバーが1人でも生存している場合trueを返す。
  boolean partyIsAlive(List<Member> members) {
    return members.stream().anyMatch(member -> member.isAlive());
  }
}
