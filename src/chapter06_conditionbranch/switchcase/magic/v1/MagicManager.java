package chapter06_conditionbranch.switchcase.magic.v1;

import chapter06_conditionbranch.switchcase.magic.MagicType;
import chapter06_conditionbranch.switchcase.magic.Member;

class MagicManager {
  String getName(MagicType magicType) {
    String name = "";

    switch (magicType) {
      case fire:
        name = "ファイア";
        break;
      case shiden:
        name = "紫電";
        break;
    }

    return name;
  }

  int costMagicPoint(MagicType magicType, Member member) {
    int magicPoint = 0;

    switch (magicType) {
      case fire:
        magicPoint = 2;
        break;
      case shiden:
        magicPoint = 5 + (int)(member.level * 0.2);
        break;
    }

    return magicPoint;
  }

  int attackPower(MagicType magicType, Member member) {
    int attackPower = 0;

    switch (magicType) {
      case fire:
        attackPower = 20 + (int)(member.level * 0.5);
        break;
      case shiden:
        attackPower = 50 + (int)(member.agility * 1.5);
        break;
    }

    return attackPower;
  }
}
