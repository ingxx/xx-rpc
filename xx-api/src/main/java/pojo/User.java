package pojo;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * @program: xx-rpc
 * @description:
 * @author: weijiankai
 * @create: 2020-10-22 10:45
 **/
@Data
@Builder
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String name;
}
