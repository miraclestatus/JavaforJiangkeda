package com.neusoft.redbag;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
public class LuckyMoneyController {
    @Autowired
    private LuckyMoneyRepository repository;

    /**
     * 获取红包列表
     * @return
     */
//    @GetMapping("/list")
    @RequestMapping("/list")
    public List<LuckyMoney> list(){
        return repository.findAll();
    }

    /**
     *发红包
     * @param producer
     * @param money
     * @return
     */
    @PostMapping("/post")
    public LuckyMoney postRedBag(@RequestParam(value = "producer", required = true)String producer , @RequestParam(value = "money", required = true)BigDecimal money){
        LuckyMoney luckyMoney = new LuckyMoney();
        luckyMoney.setProducer(producer);
        luckyMoney.setMoney(money);
        return repository.save(luckyMoney);
    }

}
