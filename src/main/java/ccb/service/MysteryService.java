package ccb.service;

import ccb.dao.MysteryDao;
import ccb.entity.Mystery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2016/11/24.
 */
@Component
public class MysteryService {
    @Autowired
    private MysteryDao mysteryDao;

    public void post(Mystery mystery){
        mysteryDao.post(mystery);
    }
}
