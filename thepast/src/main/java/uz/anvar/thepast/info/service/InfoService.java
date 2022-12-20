package uz.anvar.thepast.info.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.anvar.thepast.info.dto.InfoDto;
import uz.anvar.thepast.info.model.Info;
import uz.anvar.thepast.info.repository.InfoRepository;

import java.util.Optional;

@Service
public class InfoService {

    @Autowired
    private InfoRepository repository;

    public InfoDto get(Integer id) {
        Info entity = checkId(id);
        InfoDto dto = new InfoDto();
        convertEntityToDto(entity,dto);

        return dto;
    }

    private void convertEntityToDto(Info entity, InfoDto dto) {
        dto.setTitle(entity.getTitle());
        dto.setAuthor(entity.getAuthor());
        dto.setBody(entity.getBody());
        dto.setHashtag(entity.getHashtag());
        dto.setImage(entity.getImage());
        dto.setPart(entity.getPart());
        dto.setPostedAt(entity.getPostedAt());

    }

    private Info checkId(Integer id) {
        Optional<Info> optional = repository.findById(id);
        if (optional.isEmpty()){
            throw new IllegalArgumentException("Info not found");
        }
        return optional.get();
    }

    public InfoDto postInfo(InfoDto dto) {
        Info entity = new Info();
        convertDtoToEntity(dto,entity);

        return null;
    }

    private void convertDtoToEntity(InfoDto dto, Info entity) {

        entity.setTitle(dto.getTitle());
        entity.setAuthor(dto.getAuthor());
        entity.setBody(dto.getBody());
        entity.setHashtag(dto.getHashtag());
        entity.setImage(dto.getImage());
        entity.setPart(dto.getPart());
        entity.setPostedAt(dto.getPostedAt());


    }
}
