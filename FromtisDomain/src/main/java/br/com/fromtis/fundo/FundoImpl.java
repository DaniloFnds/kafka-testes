package br.com.fromtis.fundo;

import br.com.fromtis.fundo.entity.Fundo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FundoImpl implements IFundo {

    @Autowired
    private FundoDao fundoDao;

    @Override
    public Fundo findOne(final Integer id) {
        return null;
    }
}
