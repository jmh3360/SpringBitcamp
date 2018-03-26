package com.bitcamp.web.serviceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.controller.HomeController;
import com.bitcamp.web.domain.LottoDTO;
import com.bitcamp.web.service.LottoService;

@Service
public class LottoServiceImpl implements LottoService{
	@Autowired LottoDTO lotto;
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@Override
	public LottoDTO findLottoCount(LottoDTO param) {
		logger.info("금액금액 {} ", param.getMoney());
		lotto.setCount(String.valueOf(Integer.parseInt(param.getMoney()) / 1000));
		return lotto;
	}

			@Override
			    public LottoDTO createLotto() {
			        String temp = "[";
			        int[] res = new int[6];
			        for(int i = 0; i < 6; i++) {
			            res[i] = (int)(Math.random() * 45) + 1;
			            for(int j = 0; j < i; j++) {
			                if(res[i] == res[j]) {
			                    i--;
			                    break;
			                }
			            }
			        }
			        Arrays.sort(res);
			        for(int i = 0; i < 6; i++) { 
			            if(i != 5) {
			                temp += res[i] + ", ";
			            } else {
			                temp += res[i];
			            }
	}
	temp += "]\n";
	lotto.setRandomNumber(temp);
	return lotto;
	}
	@Override
	public List<LottoDTO> createLottos(LottoDTO param) {
		List<LottoDTO> list = new ArrayList<>();
		int count = Integer.parseInt(findLottoCount(param).getCount());
		String[] foo = new String[count];
		String res = " ";
		for(int i=0;i<count;i++) {
			lotto = new LottoDTO();
			foo[i] = createLotto().getRandomNumber() ;
			res = foo[i];
			lotto.setLottoNumber(res);
			list.add(lotto);
		}
		logger.info("하하 {} ",list);
		return list;
	}

	@Override
	public void addLotto(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifyLotto(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeLotto(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<LottoDTO> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<LottoDTO> findByName(Command cmd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LottoDTO findById(Command cmd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

}
