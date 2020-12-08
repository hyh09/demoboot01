package com.example.demobatch.ch02.entity;

import lombok.Data;

/**
 * @author huyunhui
 * @ClassName CreditBill
 * @date 2020/11/27 19:51
 * @desc TODO 信用卡账单领域对象
 * @see
 */

@Data
public class CreditBill {
    private  String  accountID ="";//银行卡账号id
    private  String name;//持卡人姓名
    private  double  amount =0;//消费金额
    private  String date;//消费日期 格式 YYYY-MM-DD HH:MM:SS
    private  String  address;//消费场所




}
