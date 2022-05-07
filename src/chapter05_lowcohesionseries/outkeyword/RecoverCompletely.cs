static void RecoverCompletely(out int hitPoint, out int magicPoint) {
  hitPoint = MAX_HIT_POINT;
  magicPoint = MAX_MAGIC_POINT;
}

int hitPoint;
int magicPoint;
RecoverCompletely(out hitPoint, out magicPoint);
member.HitPoint = hitPoint;
member.MagicPoint = magicPoint;
