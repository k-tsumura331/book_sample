package chapter08_tightcoupling.util.v1;

import chapter08_tightcoupling.util.MailMagazine;
import chapter08_tightcoupling.util.ViewSettings;

class Util {
  private int reservationId;          // 商品の予約ID
  private ViewSettings viewSettings;  // 画面表示設定
  private MailMagazine mailMagazine;  // メールマガジン

  void cancelReservation() {
    // reservationIdを使った予約キャンセル処理
  }

  void darkMode() {
    // viewSettingsを使ったダークモード表示への変更処理
  }

  void beginSendMail() {
    // mailMagazineを使ったメール配信開始処理
  }
}
