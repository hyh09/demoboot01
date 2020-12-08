package com.example.demobatch.ch02;

import com.example.demobatch.ch02.entity.CreditBill;
import org.springframework.batch.item.ItemProcessor;

/**
 * @author huyunhui
 * @ClassName CreditBillProcessor
 * @date 2020/12/8 14:00
 * @desc TODO
 * @see
 */
public class CreditBillProcessor implements ItemProcessor<CreditBill, CreditBill> {

    @Override
    public CreditBill process(CreditBill creditBill) throws Exception {
        System.out.println("读取的数据"+creditBill.toString());
        return creditBill;
    }
}

